package kiosk3;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    
    // Kiosk가 관리할 메뉴 리스트
    private List<MenuItem> menuItems;
    
    // 입력 처리를 위한 Scanner
    private Scanner sc = new Scanner(System.in);
    
    // 생성자에서 메뉴데이터 받기
    public Kiosk(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }


    // 키오스크 실행 함수: main에서 호출
    public void start() {
        while (true) {
            printMenu();
            
            int select;
            try {
                select = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("메뉴 번호를 입력하세요.");
                continue;
            }
            
            // 프로그램 종료
            if(select == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (select >= 1 && select <= menuItems.size()) {
                MenuItem m = menuItems.get(select - 1);
                System.out.println("선택한 메뉴: " + m.toString());
            } else {
                System.out.println("잘못된 메뉴 번호입니다. 다시 입력하세요");
            }
            System.out.println();
        }
    }
    // 메뉴 출력 함수 (내부 로직 캡슐화)
    private void printMenu() {
        System.out.println("[ SHAKESHACK MENU ]");
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, menuItems.get(i).toString());
        }
        System.out.println("0. 종료");
    }
}
