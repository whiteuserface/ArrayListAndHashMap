package Collection;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;
public class Main {
    //ArrayList -> 배열이고 늘어난다.
    //LinkedList -> 연결시키는 형태
    //Vector
    //Stack 
    public static void main(String[] args){
        ArrayList<Info> list = new ArrayList<>();
        HashMap<Integer, Info> map = new HashMap<>();
        String name = null;
        int age = 0;
        int menuNum = 0;
        Scanner sc = new Scanner(System.in);
        boolean oc = true;
    while(oc){
        menu();
        menuNum = sc.nextInt();
        if(menuNum==1){
            System.out.print("이름입력:");
            name = sc.next();
            System.out.print("나이입력:");
            age = sc.nextInt();
            list.add(new Info(name, age));
            map.put(list.size()-1,list.get(list.size()-1));
            // System.out.println(map.get(list.size()-1));
        } else if(menuNum==2){
            System.out.print("이름을 입력해주세요:");
            name = sc.next();
            for(int i=0; i<list.size(); i++){
                if(list.get(i).getName().equals(name)){
                    System.out.println(i+"번째에 같은 이름이 있습니다.");
                } else {
                    System.out.println("같은 이름이 없습니다.");
                }
            }
        } else if(menuNum==3){
            for(Info info : list){
                System.out.println(info);
            }
            System.out.print("수정하실 번호를 입력하세요:");
            int index = sc.nextInt();
            System.out.print("수정하실 이름을 입력하세요.");
            name = sc.next();
            System.out.print("수정하실 나이을 입력하세요.");
            age = sc.nextInt();
            //해쉬맵으로 key값으로 수정할 번호를 넣고
            map.replace(index, new Info(name, age));
            Info tmp = map.get(index);
            list.set(index, tmp);
            //해쉬맵의 Info를 수정 후
            //해쉬맵의 객체를 list의 객체로 수정
        } else if(menuNum==4){
            for(Info info : list){
                System.out.println(info);
            }
            System.out.print("삭제하실 번호를 입력하세요:");
            int index = sc.nextInt();
            list.remove(index);
            System.out.println(index+"번째가 삭제되었습니다.");
        } else if(menuNum==5){
            for(Info info : list){
                System.out.println(info);
            }
        } else if(menuNum==6){
            System.out.println("종료됩니다.");
            oc = false;
        }
    }

        
    }
    private static void menu() {
        System.out.print("1.등록 \n2.검색\n3.수정\n4.삭제\n5.목록\n6.종료");
    }
   
}

