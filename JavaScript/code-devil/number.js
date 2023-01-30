/*
* 숫자형 Number
* Infinity : 무한대
* NaN : Not a Number (숫자가 아님)
* -> 숫자 관련하여 작업 시 항상 NaN 체크를 하고 작업하는 습관
* */

const age = 30; // 숫자형 Number
const PI = 3.14;

console.log(1 + 2); // 더하기
console.log(10 - 3); // 빼기
console.log(3 * 2); // 곱하기
console.log(6 / 3); // 나누기
console.log(6 % 4); // 나머지
console.log(6 % 4); // 나머지
console.log(6 % 4); // 나머지
console.log(6 % 4); // 나머지

const x = 1 / 0; // Infinity
console.log(x);

const name = "Mike";
const y = name / 2;
console.log(y); // NaN
