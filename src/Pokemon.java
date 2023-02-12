import java.util.Scanner;

public class Pokemon {
    public Pokemon(){
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = null;
        String owner = null;
        String skill = null;

        int menu_1 = 0;
        int menu_2 = 0;
        int count = 0;
        int attack = 0;

        System.out.printf("총 %s마리의 포켓몬이 생성되었습니다\n", count);

        System.out.print("1) 포켓몬 생성  2) 프로그램 종료 : ");
        menu_1 = sc.nextInt();
        while (true) {
            if (menu_1 == 2) {
                System.out.println("프로그램 종료");
                System.exit(0);
            } else {
                break;
            }
            count = count + 1;
        }
        sc.nextLine();
        System.out.print("1) 피카츄  2) 꼬부기  3) 파이리 : ");
        menu_2 = sc.nextInt();
        if (menu_2 == 1){
            name = "피카츄";
        }else if (menu_2 == 2){
            name = "꼬부기";
        }else{
            name = "파이리";
        }
        sc.nextLine();
        System.out.print("플레이어 이름 입력 : ");
        owner = sc.nextLine();
        System.out.print("사용 가능한 기술 입력(/로 구분하여 입력) :");
        skill = sc.nextLine();
        String [] skills = skill.split("/");

        System.out.printf("포켓몬 생성 : %s\n", name);
        System.out.printf("%s의 포켓몬이 사용 가능한 스킬\n", owner);
        for (int i = 0; i < skills.length; i++) {
            System.out.printf("%d : %s\n", i+1, skills[i]);
        }

        System.out.print("공격 번호 선택 : ");
        attack = sc.nextInt();
        sc.nextLine();
        System.out.printf("%s의 %s가 %s 공격 시전!", owner, name, skills[attack-1]);


    }
}
