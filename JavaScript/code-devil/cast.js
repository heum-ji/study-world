/*
* 명시적 형변환
* String() : 문자형으로 변환
*
* Number() : 숫자형으로 변환
* - 숫자 안에 문자열 있는 경우 : NaN
* - true : 1, false : 0
* [주의]
* null : 0
* undefined : NaN
*
* Boolean() : true / false 변환
* - false : 숫자 0, 빈 문자열 '', null, undefined, NaN
* - true : false 제외 모두
* [주의]
* 0 : false, '0' : true
* '' : false, ' ' : true
* */

// const mathScore = prompt("수학 몇점?");
// const engScore = prompt("영어 몇점?");
// const result = (mathScore + engScore) / 2;

// console.log(result);

// console.log(String(3), String(true), String(false), String(null), String(undefined));
// console.log(Number("123ddf4"));
// console.log(Number(true), Number(false));

console.log(Boolean(1), Boolean(123), Boolean("javascript")); // true true true
// false false false false false
console.log(Boolean(0), Boolean(''), Boolean(null), Boolean(undefined), Boolean(NaN));

