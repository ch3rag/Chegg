const prompt = require('prompt-sync')();
let obj=
{
    id1:"apples",
    id2:"oranges",
    id3:"grapes",
};
let objPrices=
{
    id1:100,
    id2:50,
    id3:40
};

let items=[];
let finalPrice=0;
let x='z';

class CashRegister
{
  
   gettingitems() {
                
        for (const [key, value] of Object.entries(obj)) {
            console.log(`${key}: ${value}`);
        }
        while(x!=='y')
        {
            
            let item=Number(prompt(`Enter the item id want to buy`));
            let quantity=Number(prompt(`Enter the number of items`));
            let price=objPrices["id"+item]*quantity;
            finalPrice+=price*0.3+price;
            x=prompt(`enter 'y' to exit the program`);
        }
    }
   purchaseTotal()
   {
       let finalPricee_last=finalPrice-finalPrice*0.06;
       alert(`Your final price  is ${finalPricee_last}`);

       return {final_price:finalPricee_last,tax:finalPrice*0.06};
   }
}

let obj_1=new CashRegister();
obj_1.gettingitems();
console.log(obj_1.purchaseTotal());
let obj_2=new CashRegister();
obj_2.gettingitems();
// console.log(obj_2.());