/*
* 연산자 (Operator)
*
* 제곱 = **
* 연산자 줄여쓰기 가능 ex) +=, *=, %=, Etc
* 전위 : 선 증가 후 대입
* 후위 : 선 대입 후 증가
*
* 비교 연산자 (>, ==, != 등)
*   동등 연산자
*   == : 값만 비교
*   일치 연산자
*   === : 값과 타입 모두 비교
*
* 논리 연산자
* || : ~이거나, 모든 값이 false 인 경우 false
* -> 첫번째 true 발견 시 평가 멈춤 (조건 여러개 적을 시 쉽게 true 될 가능성 높은것을 왼쪽으로 두면 좋음)
* a || b : a와 b 중 true 가 있으면 true
*
* && : ~이고, 하나라도 false 인 경우 false
* -> 첫번째 false 발견 시 평가 멈춤 (조건 여러개 적을 시 쉽게 false 될 가능성 높은것을 왼쪽으로 두면 좋음)
*  a && b : a와 b 둘 다 true 면 true
*
* !(NOT) : true <-> false
* !a : a가 false 이면 true
* */

//let num = 10;
//num++;
// let result = num++;
//
// console.log(result);


// 비교 연산자
console.log(10 > 5);
console.log(10 == 5); // 동등 연산자
console.log(10 != 5);

// 동등, 일치 연산자
const a = 1;
const b = "1";
console.log(a == b); // true
console.log(a === b); // false

// or
// 이름이 Tom 이거나, 성인이면 통과 (OR)
// ~이고 : (AND)
// const name = "Mike";
// const age = 30;
//
// if (name === 'Tom' || age > 19) {
//     console.log("통과");
// }

// NOT
// 나이를 입력 받아 성인이 아닌 경우 '돌아가' 출력

// const age = prompt('나이가..?');
// const isAdult = age > 19;
//
// if (!isAdult) {
//     console.log('돌아가..');
// }

// 우선순위
// 남자이고, 이름이 Mike 이거나 성인이면 통과
const gender = 'M';
const name = 'Jane';
const isAdult = true;

//if (gender === 'M' && name === 'Mike' || isAdult) { // 통과 - && 먼저 됨으로
if (gender === 'M' && (name === 'Mike' || isAdult)) { // 위 조건
    alert('통과');
} else {
    alert('돌아가');
}
