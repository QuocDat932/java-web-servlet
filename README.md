# Dự án Quản lý Người dùng (Java Servlet & JSP)

Dự án này là một ứng dụng web cơ bản được xây dựng bằng Java Servlet và JSP, kết hợp với giao diện có sử dụng Vue.js. Repository được chia thành nhiều nhánh (branch) theo từng giai đoạn phát triển và từng tính năng cụ thể để dễ dàng theo dõi tiến trình.

## 🌿 Cấu trúc Nhánh (Branch Structure)

Quá trình phát triển dự án được chia thành 3 giai đoạn chính:

### 1. `branch01_source_basic_jdbc_database`
Nhánh này tập trung vào việc thiết lập nền tảng ban đầu và kết nối cơ sở dữ liệu.
* **Khởi tạo dự án:** Thiết lập source code cơ bản với kiến trúc JSP/Servlet.
* **Môi trường & Xử lý lỗi:** Các cấu hình cần thiết để chạy dự án (như Tomcat) và tài liệu về các lỗi môi trường cơ bản thường gặp.
* **Kết nối CSDL:** Thiết lập cấu hình kết nối JDBC giữa BackEnd (Java) và Cơ sở dữ liệu.
## B1: Khởi tạo CSDL với MySQL
Video tham khảo: https://www.youtube.com/watch?v=QoME7Xe5MbQ&list=PLxW11aib8He5cUI3RwFPU4wa26WY5T6Ex
<img width="2880" height="1728" alt="image" src="https://github.com/user-attachments/assets/ecc46026-65ab-47d3-a2cc-e7e23fccf05b" />
## B2: Download source code và tải các thư viện
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/5eda0216-9999-4d37-936e-7806d9423836" />
<img width="1919" height="1079" alt="image" src="https://github.com/user-attachments/assets/ca0f8ce6-c800-4b95-af3f-61ee4aee0631" />
## hoặc
<img width="2880" height="1728" alt="image" src="https://github.com/user-attachments/assets/a0f7a860-8153-413b-95e3-fba0124ac760" />
## B3: Cấu hình lại file persistence.xml để connect với database (port/username/pass...)
<img width="2560" height="850" alt="image" src="https://github.com/user-attachments/assets/2d422606-7597-4912-aa59-f43ed1f20d08" />
## B4: Chạy thử file TestApp.class (nếu kết nối thành công thì sẽ chạy được kết quả)
<img width="2880" height="1728" alt="image" src="https://github.com/user-attachments/assets/b6b53f40-aaf1-46df-9e18-30d6467a2d9e" />

### 2. `branch02_basic_ui_webServlet_vuejs`
Nhánh này tập trung vào việc xây dựng giao diện người dùng và các luồng xác thực cơ bản.
* **Khởi tạo UI:** Thiết lập các file Servlet xử lý logic và các trang JSP hiển thị.
* **Xác thực người dùng:** Xây dựng hoàn chỉnh luồng Đăng nhập (Login) và Đăng ký (Register).
* **Hiển thị dữ liệu:** Xử lý luồng chuyển hướng sau khi đăng nhập thành công và tải dữ liệu hiển thị lên trang `home.jsp`.
Video tham khảo: https://www.youtube.com/watch?v=swOBsQVvN9o&list=PLxW11aib8He6QFeni6uLqjIbsVJhI4hXc&index=3
Đọc code trong các files này
<img width="2880" height="1728" alt="image" src="https://github.com/user-attachments/assets/e2284781-86f6-4492-a76b-0a641387f280" />
<img width="2866" height="1532" alt="image" src="https://github.com/user-attachments/assets/ce8ffacb-7ade-459c-a6a1-c15b40457d77" />
<img width="2866" height="1532" alt="image" src="https://github.com/user-attachments/assets/3fab5c84-f9b1-4f87-aa47-276ab94de1ca" />


### 3. `branch03_feature_research_user_by_role_name`
Nhánh này phát triển thêm tính năng nghiệp vụ cốt lõi xử lý dữ liệu.
* **Tính năng tìm kiếm:** Xây dựng chức năng tra cứu thông tin cơ bản.
* **Luồng tìm kiếm theo Role:** Triển khai luồng tìm kiếm và lọc danh sách người dùng cụ thể dựa trên Tên quyền (Role Name).
<img width="2866" height="1532" alt="image" src="https://github.com/user-attachments/assets/666206a5-6023-4268-a3f9-9e6f882d8adb" />
<img width="2866" height="1532" alt="image" src="https://github.com/user-attachments/assets/216c9fe2-4886-4a5e-99e4-186000eeff06" />
<img width="2880" height="1728" alt="image" src="https://github.com/user-attachments/assets/cc989b22-ef0d-4f0e-934d-a9d8870ee31b" />



