/**
 * 
 */

let text=document.querySelectorAll(".text");

text.forEach(e=>{
	e.addEventListener("click",function(i){
	let item = document.querySelector(`#item${i.target.value}`);//item字串加value動態生成（跳脫字元）
	console.log(item.textContent);
	let amount = document.querySelector(`#amount${i.target.value}`);
	console.log(amount);
	let cart={};
	cart[`${item.textContent}`] = amount.textContent;
	localStorage.setItem("cart",JSON.stringify(cart));
	});
})

document.querySelector(".text1").addEventListener("click",function(e){
	window.location.href="/springboot-order/openindex.html";
	
});


