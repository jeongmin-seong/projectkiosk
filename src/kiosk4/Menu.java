package kiosk4;

// File: Menu.java
import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 카테고리 이름 (예: Burgers, Drinks)
    String categoryName;

    // 각 카테고리 안의 MenuItem 리스트
    List<MenuItem> items;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    // 메뉴 추가 기능
    public void addItem(MenuItem item) {
        items.add(item);
    }

    // Getter
    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
