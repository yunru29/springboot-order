/**
 * 
 */
let get = localStorage.getItem("cart");
console.log(get.amount);
let item = JSON.parse(get);//接收JSON字串轉為JS物件or值
console.log(item);

document.getElementById('item').innerText = item.item;
document.getElementById('amount').innerText = item.amount;
let data = {
	name : item.item,
	amount : item.amount
}
console.log(data)

$.ajax({
    url: '/springboot-order/order/insert',
    type: 'POST',
    data: JSON.stringify(data),
    dataType: 'JSON',
    success: function(msg){
      console.log(msg)
    },
    error: function(errMsg){

    }
})
