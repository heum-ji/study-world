/*
* 조건문
* if, else, else if
*
* switch 문
* */

// 19살이면 수능 잘 치세요 라는 문구를 보여주세요
// const age = 19;
//
// if (age > 19) {
//     console.log('환영 합니다.');
// } else if (age === 19) {
//     console.log('수능 잘 치세요.')
// } else {
//     console.log('안녕히 가세요.');
//
// }
//
// console.log('--------------------');

/*
* 사과 : 100
* 바나나 : 200
* 키위 : 300
* 멜론 : 500
* 수박 : 500
* 사고 싶은 과일을 물어보고 가격 알려주기
* */

let fruit = prompt('무슨 과일을 사고 싶나요?');

switch (fruit) {
    case '사과' :
        alert('100원 입니다.');
        break;
    case '바나나' :
        alert('200원 입니다.');
        break;
    case '키위' :
        alert('300원 입니다.');
        break;
    case '멜론' :
        alert('500원 입니다.');
        break;
    case '수박' :
        alert('500원 입니다.');
        break;
    default:
        alert(`해당 "${fruit}" 과일은 없습니다.`);
        break;
}
