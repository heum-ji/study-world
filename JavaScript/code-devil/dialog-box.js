/*
* 대화상자 (Dialog Box)
* - 스크립트 일시 정지 됨
* - 스타일링 X
* - 간단하고 빠름
*
* alert() : 알려줌
* - 확인 버튼
*
* prompt() : 입력 받음
* - 확인, 취소(null)
* - 2번째 인수 전달 시 default 값을 줄 수 있음
*
* confirm() : 확인 받음
* - 확인(true), 취소(false)
*
* */

// const name = prompt("예약일을 입력해주세요", "2020-10-");
// alert("환영합니다, " + name + "님");
// alert(`안녕하세요, ${name}님. 환영합니다.`);

const isAdult = confirm("당신은 성인 입니까?");
console.log(isAdult);
