package kiosk4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Burger 카테고리 생성
        Menu burgers = new Menu("Burgers");
        burgers.addItem(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burgers.addItem(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));

        // Drinks 카테고리 생성
        Menu drinks = new Menu("Drinks");
        drinks.addItem(new MenuItem("Coke", 1.9, "콜라 355ml"));
        drinks.addItem(new MenuItem("Sprite", 1.9, "사이다 355ml"));

        // 여러 메뉴 카테고리를 리스트로 묶기
        List<Menu> menus = new ArrayList<>();
        menus.add(burgers);
        menus.add(drinks);

        // Kiosk 실행
        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();
    }
}

