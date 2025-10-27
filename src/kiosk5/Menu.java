package kiosk5;

// File: Menu.java

import java.util.ArrayList;
import java.util.List;

public class Menu {
    // 메뉴 이름과 항목 리스트를 private로 보호
    private String categoryName;
    private List<MenuItem> items;

    public Menu(String categoryName) {
        this.categoryName = categoryName;
        this.items = new ArrayList<>();
    }

    // 메뉴 추가 기능
    public void addItem(MenuItem item) {
        if (item != null) {
            items.add(item);
        }
    }

    // Getter
    public String getCategoryName() {
        return categoryName;
    }

    public List<MenuItem> getItems() {
        return items;
    }
}
