/*
* 반복문
* - 동일한 작업을 여러번 반복
* - 보통 정해진 횟수가 있는경우 for문, 그 외 while문
*
* for문 : 초기값;조건;증감식
*
* while문 : while(조건식)
*
* do-while문 : 최소 1번 실행 후 조건식 판단
* - do {} while(조건식)
*
* break : 멈추고 빠져나옴
* continue : 멈추고 다음 반복으로 진행
* */

// for (let i = 0; i < 10; i++) {
//     console.log(i + 1);
// }


// break
// while (true) {
//     let answer = confirm('계속 할까요?');
//
//     if (!answer) {
//         break;
//     }
// }

// continue
// 짝수만

for (let i = 0; i < 10; i++) {
    if (i % 2) {
        continue;
    }
    console.log(i);
}
