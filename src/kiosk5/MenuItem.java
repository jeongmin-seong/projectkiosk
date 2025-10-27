package kiosk5;

public class MenuItem {
    // 필드를 private로 선언해서 외뷰 직접 접근 차단
    private String name;
    private double price;
    private String description;

    // 생성자 : MenuItem 객체 생성 시 필수 정보만 입력받도록 제한
    public MenuItem(String name, double price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    // Getter : 외부에서 읽을 수 있지만 직접 수정은 불가능하게 함
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    // setter : 특정 상황에서만 값 변경 허용
    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("가격은 0보다 작을 수 없습니다.");
        } else {
            this.price = price;
        }
    }

    @Override
    public String toString() {
        return getName() + " | W " + getPrice() + " | " + getDescription();
    }
}
