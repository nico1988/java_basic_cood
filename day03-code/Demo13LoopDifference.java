/*
����ѭ��������

1. ��������жϴ���û�����������ôforѭ����whileѭ������ִ��0�Σ�����do-whileѭ����ִ������һ�Ρ�
2. forѭ���ı�����С���ŵ��ж��壬ֻ��ѭ���ڲ��ſ���ʹ�á�whileѭ����do-whileѭ����ʼ����䱾���������棬���Գ���ѭ��֮�󻹿��Լ���ʹ�á�
*/
public class Demo13LoopDifference {
	public static void main(String[] args) {
		for (int i = 1; i < 0; i++) {
			System.out.println("Hello");
		}
		// System.out.println(i); // ��һ���Ǵ���д������Ϊ����i������forѭ��С�����ڣ�ֻ��forѭ���Լ������á�
		System.out.println("================");
		
		int i = 1;
		do {
			System.out.println("World");
			i++;
		} while (i < 0);
		// �����Ѿ�������do-whileѭ���ķ�Χ��������Ȼ����ʹ�ñ���i
		System.out.println(i); // 2
	}
}