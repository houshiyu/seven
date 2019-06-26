package recycle;

public class SwitchTest {
    public static void main(String[] args) {
        char ch='d';
        switch (ch){
            case('a'):
                System.out.println("优秀");
                break;
            case('b'):
                System.out.println("良好");
                break;
            case('c'):
                System.out.println("及格");
                break;
            case('d'):
                System.out.println("不及格");
                break;
            default:
                System.out.println("没有这种等级");
            }
        }
    }
