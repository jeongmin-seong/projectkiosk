package kiosk4;

public class MenuItem {
    // 메뉴가 가지는 속성 정의
    String name;
    double price;
    String description;

    // 생성자 : MenuItem 객체 생성 시 필요한 데이터 전달받음
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // toString() : 객체를 문자열로 호출할 때 자동으로 호줄됨
    @Override
    public String toString() {
        return name + " | W " + price + " | " + description;
    }
}
