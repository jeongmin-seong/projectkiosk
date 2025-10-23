package kiosk2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여러 MenuItem 객체를 보관할 리스트 생성
        List<MenuItem> menuItems = new ArrayList<>();

        // new MenuItem()을 통해 객체 생성 및 리스트에 보관
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[ SHAKESHACK MENU ]");
            // 반복문으로 리스트 내 모든 메뉴 출력
            for (int i = 0; i < menuItems.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, menuItems.get(i).toString());
            }
            System.out.println("0. 종료");

            int select;
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("메뉴 번호를 입력하세요.");
                continue;
            }

            if (select == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (select >= 1 && select <= 4) {
                System.out.println("선택한 메뉴: " + select + "번");
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 입력하세요.");
            }
            System.out.println();
        }
        sc.close();
    }

}

