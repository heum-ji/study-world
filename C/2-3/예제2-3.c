/*
	\n : ����, new line
	- ���� �ٷ� �̵�

	\b : �齺���̽�, backspace
	- �� ĭ �������� �̵�

	\r : ĳ���� ����, carriage return
	- �� ������ �̵�

	\a : �˷� �溸, alert
	- ���Ҹ�
*/
#include <stdio.h>

int main(void)
{
	printf("Be happy\n");				// "Be happy"�� ����ϰ� ���� �ٲ�(\n)
	printf("12345678901234567890\n");	// ȭ�鿡 �� ��ȣ ����ϰ� ���� �ٲ�(\n)
	printf("My\tfriend\n");				// "My"�� ����ϰ� �� ��ġ�� �̵�(\t) �Ŀ� "friend"�� ����ϰ� ���� �ٲ�(\n)

	// "Goot"�� ����ϰ� �������� �̵�(\b)�� t�� d�� �ٲٰ� �� ��ġ�� �̵�(\t) �Ŀ� "chance"�� ����ϰ� ���� �ٲ�(\n)
	printf("Goot\bd\tchance\n");
	printf("Cow\rW\a\n");				// �� ������ �̵�(\r)�� C�� W�� �ٲٰ� ���Ҹ�(\a)�� ���� ���� �ٲ�(\n)

	return 0;
}