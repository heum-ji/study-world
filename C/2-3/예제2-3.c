/*
	\n : 개행, new line
	- 다음 줄로 이동

	\b : 백스페이스, backspace
	- 한 칸 왼쪽으로 이동

	\r : 캐리지 리턴, carriage return
	- 맨 앞으로 이동

	\a : 알럿 경보, alert
	- 벨소리
*/
#include <stdio.h>

int main(void)
{
	printf("Be happy\n");				// "Be happy"를 출력하고 줄을 바꿈(\n)
	printf("12345678901234567890\n");	// 화면에 열 번호 출력하고 줄을 바꿈(\n)
	printf("My\tfriend\n");				// "My"를 출력하고 탭 위치로 이동(\t) 후에 "friend"를 출력하고 줄을 바꿈(\n)

	// "Goot"를 출력하고 왼쪽으로 이동(\b)해 t를 d로 바꾸고 탭 위치로 이동(\t) 후에 "chance"를 출력하고 줄을 바꿈(\n)
	printf("Goot\bd\tchance\n");
	printf("Cow\rW\a\n");				// 맨 앞으로 이동(\r)해 C를 W로 바꾸고 벨소리(\a)를 내고 줄을 바꿈(\n)

	return 0;
}