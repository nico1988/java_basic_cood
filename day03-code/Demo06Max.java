// ��Ŀ��ʹ����Ԫ������ͱ�׼��if-else���ֱ�ʵ�֣�ȡ�������ֵ��е����ֵ
public class Demo06Max {
	public static void main(String[] args) {
		int a = 105;
		int b = 20;
		
		// ����ʹ����Ԫ�����
		// int max = a > b ? a : b;
		
		// ʹ�ý����if���
		int max;
		if (a > b) {
			max = a;
		} else {
			max = b;
		}
		
		System.out.println("���ֵ��" + max);
	}
}