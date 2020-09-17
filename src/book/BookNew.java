package book;

import java.util.ArrayList;
import java.util.Arrays;
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


        List<Book> bookList = new ArrayList<>(Arrays.asList(book1, book2, book3, book4, book5));
        bookList.addAll(Arrays.asList(book6, book7, book8, book9, book10));
        while (true) {
            for (String s : Arrays.asList("mời chọn chức năng",
                    "1 : Tính Tiền Từng Loại Sách : ",
                    "2 : Sắp Xếp Theo Loại Bookcode Và Giá Tiền: ",
                    "3 : Tổng Số Tiền Của Sách Trong Cửa Hàng:",
                    "4 : Tìm Kiếm Ngôn Ngữ:",
                    "5 : Thoát Chương Trình:")) {
                System.out.println(s);
            }
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
                            for (Book book : bookList) {
                                sum += book.getPrice();
                            }
                            System.out.println("Tổng số tiền trong ProgrammingBook :" + sum);
                            break;
                        case 2:
                            for (Book book : bookList) {
                                sum1 += book.getPrice();
                            }
                            System.out.println("Tổng số tiền trong FictionBook :" + sum1);
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + num);
                    }
                    break;
                case 2:
                    System.out.println("Sắp Xếp Theo \n 1:Sắp Xếp Giá Tiền \n 2:Sắp Xếp bookCode");
                    int nums = Integer.parseInt(sc.nextLine());
                    Book a;
                    switch (nums) {
                        case 1: {
                            int i = bookList.size() - 2;
                            while (i >= 0) {
                                int j = 0;
                                while (j < bookList.size() - 1 - i) {
                                    if (bookList.get(j).getPrice() > bookList.get(j + 1).getPrice()) {
                                        a = bookList.get(j);
                                        bookList.set(j, bookList.get(j + 1));
                                        bookList.set(j + 1, a);
                                    }
                                    j++;
                                }
                                i--;
                            }
                        }
                        for (Book value : bookList) {
                            System.out.println(value.getPrice());
                        }
                        break;
                        case 2:
                            for (int i = bookList.size() - 2; i >= 0; i--) {
                                int j = bookList.size() - 1 - i - 1;
                                while (j >= 0) {
                                    if (bookList.get(j).getBookCode() <= bookList.get(j + 1).getBookCode()) {
                                        j--;
                                        continue;
                                    }
                                    a = bookList.get(j);
                                    bookList.set(j, bookList.get(j + 1));
                                    bookList.set(j + 1, a);
                                    j--;
                                }
                            }
                            for (Book book : bookList) {
                                System.out.println(book.getBookCode());
                            }
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + nums);
                    }
                    break;
                case 3:
                    System.out.println("Nhập Giá");
                    int many = sc.nextInt();
                    for (Book book : bookList)
                        if (many == book.getPrice()) {
                            System.out.println("Tên Sách : " + book.getName() +
                                    "\n Tên Tác Giả : " + book.getAuthor());
                        } else {
                            System.out.println("Không Tìm Thấy");
                            break;
                        }
                    break;
                case 4:
                    System.out.println("Nhập Ngôn Ngữ Cần Tìm");
                    String string = sc.nextLine();
                    int index = 0;
                    for (Book book : bookList) {
                        boolean check = book instanceof ProgrammingBook;
                        if (!check) {
                            continue;
                        }
                        if (!string.equals(((ProgrammingBook) book).getLanguage())) {
                            continue;
                        }
                        System.out.println("Sách Có Ngô Ngữ :" + book);
                        index += 1;
                    }
                    if (!(index <= 0)) {
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
    }

}


