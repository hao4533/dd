1/
#!/bin/bash

# In ra tên người dùng đang đăng nhập
echo "Hello $USER"

# In thư mục hiện hành
echo "Thư mục hiện hành: $(pwd)"

# In tất cả tập tin và thư mục (bao gồm cả các tập tin/thư mục ẩn -a)
echo "Danh sách tập tin và thư mục:"
ls -a

# In ngày và giờ hiện tại
echo "Ngày và giờ hiện tại: $(date)"

2/
#!/bin/bash

# Khai báo Họ và Tên của bạn để so sánh
MY_HO="Nguyen"
MY_TEN="An"

read -p "Nhập họ: " ho
read -p "Nhập tên: " ten

# So sánh chuỗi nhập vào với thông tin của bạn
if [ "$ho" = "$MY_HO" ] && [ "$ten" = "$MY_TEN" ]; then
    echo "Họ và tên bạn nhập trùng khớp với họ và tên của tôi!"
else
    echo "Họ và tên bạn nhập không trùng khớp."
fi

3/
#!/bin/bash

# Lấy giờ hiện tại (định dạng 00-23). 
# Dùng 10# để ép kiểu về số thập phân (tránh lỗi octal khi giờ là 08, 09)
gio=$(10#$(date +%H))

if [ $gio -ge 0 ] && [ $gio -lt 12 ]; then
    echo "Chào buổi sáng"
elif [ $gio -ge 12 ] && [ $gio -lt 18 ]; then
    echo "Chào buổi trưa"
else
    echo "Chào buổi tối"
fi
