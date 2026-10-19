[menu-huynhanhhao.sh](https://github.com/user-attachments/files/33656276/menu-huynhanhhao.sh)
#!/bin/bash

HOTEN="Huynh Anh Hao"
EMAIL="haob2305569@student.ctu.edu.vn"
SDT="0912345678"

while true; do
    clear

    echo "1. Ho ten"
    echo "2. Email"
    echo "3. Dien thoai"
    echo "4. Ket thuc"

    read -p "Chon (1-4): " chon

    case $chon in
        1)
            echo "Ngay gio thuc hien: $(date)"
            echo "Ho va ten: $HOTEN"
            read -p "Nhan Enter de tiep tuc..."
            ;;
        2)
            echo "Email: $EMAIL"
            read -p "Nhan Enter de tiep tuc..."
            ;;
        3)
            echo "In 10 lan so dien thoai:"
            for (( i=1; i<=10; i++ )); do
                echo "$i. $SDT"
            done
            read -p "Nhan Enter de tiep tuc..."
            ;;
        4)
            echo "Ket thuc chuong trinh."
            exit 0
            ;;
        *)
            ;;
    esac
done
