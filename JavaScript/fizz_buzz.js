// let n = process.argv.pop();
// for(let i = 1; i < n; i++){
//     if(i % 3 == 0 && i % 5 == 0){
//         console.log("fizzbuzz");
//     }
//     else if(i % 3 == 0){
//         console.log("fizz");
//     }
//     else if(i % 5 == 0){
//         console.log("buzz");
//     } 
//     else{
//         console.log(i);
//     }
// }

// let fizz = 1;
// let buzz = 1;
// let n = process.argv.pop();

// for(let i = 1; i<=n; i++){
//     if(fizz === 3 && buzz === 5){
//         console.log("fizzbuzz");
//         fizz = 1;
//         buzz = 1;
//     }
//     else if(fizz === 3){
//         console.log("fizz");
//         fizz = 1;
//         buzz++;
//     }
//     else if(buzz === 5){
//         console.log("buzz");
//         buzz = 1;
//         fizz++;
//     }
//     else{
//         console.log(i);
//         fizz++;
//         buzz++;
//     }
// }

let n = process.argv.pop();
let fizz = 1;
let buzz = 1;

for(let i = 1; i <= n; i++){
    let str = "";
    if(fizz === 3){
        str += "fizz";
        fizz = 0;
    }
    if(buzz === 5){
        str += "buzz";
        buzz = 0;
    }
    if(str === ""){
        str += i;
    }
    fizz++;
    buzz++;
    console.log(str);
}