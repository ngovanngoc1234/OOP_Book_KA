package book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookNew {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ProgrammingBook book1 = new ProgrammingBook(11,
                "Tâm hồn người phụ nữ 1", 3200000,
                "Ngô Van Ngọc 1", "Java", "Vẻ Đẹp Tâm Hồn ");

        ProgrammingBook book2 = new ProgrammingBook(26,
                "Tâm hồn người phụ nữ 2", 5400000,
                "Ngô Van Ngọc 2", "PHP", "Vẻ Đẹp Tâm Hồn 1");

        ProgrammingBook book3 = new ProgrammingBook(35,
                "Tâm hồn người phụ nữ 3", 30000,
                "Ngô Van Ngọc 3", "Javascript", "Vẻ Đẹp Tâm Hồn 2");

        ProgrammingBook book4 = new ProgrammingBook(48,
                "Tâm hồn người phụ nữ 4", 2360000,
                "Ngô Van Ngọc 4", "Java", "Vẻ Đẹp Tâm Hồn 3");

        ProgrammingBook book5 = new ProgrammingBook(50,
                "Tâm hồn người phụ nữ 5", 5000,
                "Ngô Van Ngọc 5", "C++", "Vẻ Đẹp Tâm Hồn 4");


        FictionBook book6 = new FictionBook(63, "Tâm Hồn Người Phụ Nữ  5",
                235000, "Ngô Văn Ngọc 6", "A");

        FictionBook book7 = new FictionBook(77, "Tâm Hồn Người Phụ Nữ  6",
                680000, "Ngô Văn Ngọc 7", "B");

        FictionBook book8 = new FictionBook(83, "Tâm Hồn Người Phụ Nữ  7",
                540000, "Ngô Văn Ngọc 8", "C");

        FictionBook book9 = new FictionBook(91, "Tâm Hồn Người Phụ Nữ  8",
                670000, "Ngô Văn Ngọc 9", "D");

        FictionBook book10 = new FictionBook(10, "Tâm Hồn Người Phụ Nữ  9",
                25800000, "Ngô Văn Ngọc 10", "E");


        List<Book> bookList = new ArrayList<>();

        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);
        bookList.add(book6);
        bookList.add(book7);
        bookList.add(book8);
        bookList.add(book9);
        bookList.add(book10);
        do {
            System.out.println("mời chọn chức năng");
            System.out.println("1 : Tính Tiền Từng Loại Sách : ");
            System.out.println("2 : Sắp Xếp Theo Loại Bookcode Và Giá Tiền: ");
            System.out.println("3 : Tổng Số Tiền Của Sách Trong Cửa Hàng:");
            System.out.println("4 : Tìm Kiếm Ngôn Ngữ:");
            System.out.println("5 : Thoát Chương Trình:");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    System.out.println("Tính Số Tiền Loại Sách " +
                            "\n 1:ProgrammingBook \n 2:FictionBook");
                    int num = Integer.parseInt(sc.nextLine());
                    int sum = 0;
                    int sum1 = 0;
                    switch (num) {
                        case 1:
                            for (int i = 0; i < bookList.size(); i++) {
                                sum += bookList.get(i).getPrice();
                            }
                            System.out.println("Tổng số tiền trong ProgrammingBook :" + sum);
                            break;
                        case 2:
                            for (int i = 0; i < bookList.size(); i++) {
                                sum1 += bookList.get(i).getPrice();
                            }
                            System.out.println("Tổng số tiền trong FictionBook :" + sum1);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Sắp Xếp Theo \n 1:Sắp Xếp Giá Tiền \n 2:Sắp Xếp bookCode");
                    int nums = Integer.parseInt(sc.nextLine());
                    Book a;
                    switch (nums) {
                        case 1:
                            for (int i = 0; i < bookList.size() - 1; i++) {
                                for (int j = 0; j < bookList.size() - 1 - i; j++) {
                                    if (bookList.get(j).getPrice() > bookList.get(j + 1).getPrice()) {
                                        a = bookList.get(j);
                                        bookList.set(j, bookList.get(j + 1));
                                        bookList.set(j + 1, a);
                                    }
                                }
                            }
                            for (int i = 0; i < bookList.size(); i++) {
                                System.out.println(bookList.get(i).getPrice());
                            }
                            break;
                        case 2:
                            for (int i = 0; i < bookList.size() - 1; i++) {
                                for (int j = 0; j < bookList.size() - 1 - i; j++) {
                                    if (bookList.get(j).getBookCode() > bookList.get(j + 1).getBookCode()) {
                                        a = bookList.get(j);
                                        bookList.set(j, bookList.get(j + 1));
                                        bookList.set(j + 1, a);
                                    }
                                }
                            }
                            for (int i = 0; i < bookList.size(); i++) {
                                System.out.println(bookList.get(i).getBookCode());
                            }
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Nhập Giá");
                    int many = sc.nextInt();
                    for (int i = 0; i < bookList.size(); i++) {
                        if (many == bookList.get(i).getPrice()) {
                            System.out.println("Tên Sách : " + bookList.get(i).getName() +
                                    "\n Tên Tác Giả : " + bookList.get(i).getAuthor());
                        }
                    }
                    break;
                case 4:
                    System.out.println("Nhập Ngôn Ngữ Cần Tìm");
                    String string = sc.nextLine();
                    int index = 0;
                    for (int i = 0; i < bookList.size(); i++) {
                        boolean check = bookList.get(i) instanceof ProgrammingBook;
                        if (check) {
                            if (string.equals(((ProgrammingBook) bookList.get(i)).getLanguage())) {
                                System.out.println("Sách Có Ngô Ngữ :" + bookList.get(i));
                                index += 1;
                            }
                        }
                    }
                    if (index > 0) {
                        System.out.println("\n Số Sách Có Ngôn Ngữ Là " + index);
                    } else {
                        System.out.println("Không Tìm Thấy ");
                    }
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lỗi");
            }
        }
        while (true);
    }

}


