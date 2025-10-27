package kiosk5;

// File: KioskLv4.java

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    private List<Menu> menus;
    private Scanner sc = new Scanner(System.in);

    public Kiosk(List<Menu> menus) {
        this.menus = menus;
    }

    public void start() {
        while (true) {
            printMainMenu();
            int catChoice;

            try {
                catChoice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하세요.");
                continue;
            }

            if (catChoice == 0) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else if (catChoice >= 1 && catChoice <= menus.size()) {
                Menu selectedMenu = menus.get(catChoice - 1);
                handleMenu(selectedMenu); // 카테고리 내부 진입
            } else {
                System.out.println("유효하지 않은 선택입니다.");
            }
            System.out.println();
        }
    }

    // 메인 카테고리 출력
    private void printMainMenu() {
        System.out.println("[ MAIN MENU ]");
        for (int i = 0; i < menus.size(); i++) {
            System.out.printf("%d. %s\n", i + 1, menus.get(i).getCategoryName());
        }
        System.out.println("0. 종료      | 종료");
    }

    // 각 카테고리 내부 메뉴 처리
    private void handleMenu(Menu menu) {
        while (true) {
            System.out.println("\n[ " + menu.getCategoryName().toUpperCase() + " MENU ]");
            List<MenuItem> items = menu.getItems();

            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, items.get(i).toString());
            }
            System.out.println("0. 뒤로가기");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("유효한 숫자를 입력하세요.");
                continue;
            }

            if (choice == 0) {
                break; // 뒤로가기
            }
            else if (choice >= 1 && choice <= items.size()) {
                MenuItem selected = items.get(choice - 1);
                System.out.println("선택한 메뉴: " + selected.toString());
                break; // 선택 후 메인 메뉴로 복귀
            }
            else {
                System.out.println("유효하지 않은 선택입니다.");
            }
        }
    }
}
