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
