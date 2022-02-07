package class_;

public class StringMain {
   public static void main(String[] args) {
      String a = "apple"; //String�� �� ���ڿ� ���ͷ� ������ �����ϴ�.
      String b = "apple"; //�Ȱ��� ���ڿ� ���ͷ��� �޸𸮿� 1���� �����ȴ�.
      if(a == b) System.out.println("a�� b�� �������� ����");
      else System.out.println("a�� b�� �������� �ٸ���");
      
      if(a.contentEquals(b)) System.out.println("a�� b�� ���ڿ��� ����");
      else System.out.println("a�� b�� ���ڿ��� �ٸ���");
      System.out.println();
      
      String c = new String("apple");
      String d = new String("apple");
      if(c == d) System.out.println("c�� d�� �������� ����");
      else System.out.println("c�� d�� �������� �ٸ���");
      
      if(c.contentEquals(d)) System.out.println("c�� d�� ���ڿ��� ����");
      else System.out.println("c�� d�� ���ڿ��� �ٸ���");
      System.out.println();
      
      String e = "���� ��¥�� " + 1991 + 7 + 16;
      System.out.println("e = "+e);
      System.out.println("���ڿ� ũ�� = " + e.length()); //14
      
      System.out.println("ù���� ���� = " + e.charAt(0));
      System.out.println("�ι�° ���� = " + e.charAt(1));
      System.out.println("������ ���� = " + e.charAt(2));
      
      System.out.println("�κ� ���ڿ� ����="+e.substring(7));
      System.out.println("�κ� ���ڿ� ����="+e.substring(7, 11));
      
      System.out.println("�빮�� ���� = " + "Hello".toUpperCase());
      System.out.println("�ҹ��� ���� = " + "Hello".toLowerCase());
      
      System.out.println("���ڿ� �˻� = " + e.indexOf("¥"));  //4
      System.out.println("���ڿ� �˻� = " + e.indexOf("��¥")); //3
      System.out.println("���ڿ� �˻� = " + e.indexOf("���ٺ�")); // -1
      System.out.println("���ڿ� �˻� = " + e.indexOf("1")); //7
      System.out.println("���ڿ� �˻� = " + e.indexOf("1", 0));
      System.out.println("���ڿ� �˻� = " + e.indexOf("1", 8));
      
      System.out.println("���ڿ� ġȯ = " + e.replace("��¥",  "����"));
   }

}

/*
���ڿ��� ������ �ȵǹǷ� �޸� 4�� �����ȴ�
JVM�� ���ؼ� ���� �� Garbage Collector�� ������
Garbage Collector�� ����Ǹ� ��ǻ�ʹ� �����

"���� ��¥�� "
"���� ��¥�� 1991"
"���� ��¥�� 19917"
        012      789
e ---> "���� ��¥�� 1991716"
*/