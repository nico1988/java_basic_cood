/*
do-whileѭ���ı�׼��ʽ��

do {
	ѭ����
} while (�����ж�);

��չ��ʽ��

��ʼ�����
do {
	ѭ����
	�������
} while (�����ж�);
*/
public class Demo11DoWhile {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			System.out.println("ԭ�������������ɣ����Ϲ�����" + i);
		}
		System.out.println("===============");
		
		int i = 1; // 1. ��ʼ�����
		do {
			System.out.println("ԭ�������������ɣ����Ϲ�����" + i); // 3. ѭ����
			i++; // 4. �������
		} while (i <= 10); // 2. �����ж�
	}
}