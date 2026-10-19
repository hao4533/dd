#!/bin/bash

while true; do
    echo ""
    echo "=== MAY TINH DON GIAN ==="
    echo "Cong (+)"
    echo "Tru (-)"
    echo "Nhan (*)"
    echo "Chia (/)"
    echo "Ket thuc (q)"
    
    read -p "Ban chon phep tinh nao ? " phetinh

    # Kiem tra neu chon thoat
    if [ "$phetinh" = "q" ]; then
        echo "Tam biet!"
        break
    fi

    # Kiem tra tinh hop le cua phep tinh
    if [ "$phetinh" != "+" ] && [ "$phetinh" != "-" ] && [ "$phetinh" != "*" ] && [ "$phetinh" != "/" ]; then
        echo "Phep tinh khong hop le, vui long chon lai!"
        continue
    fi

    # Nhap 2 so nguyen
    read -p "Nhap so thu nhat: " a
    read -p "Nhap so thu hai: " b

    # Thuc hien tinh toan
    case $phetinh in
        "+")
            kq=$((a + b))
            echo "Ket qua: $a + $b = $kq"
            ;;
        "-")
            kq=$((a - b))
            echo "Ket qua: $a - $b = $kq"
            ;;
        "*")
            kq=$((a * b))
            echo "Ket qua: $a * $b = $kq"
            ;;
        "/")
            if [ $b -eq 0 ]; then
                echo "Loi: Khong the chia cho 0!"
            else
                # Dung bc de lay ket qua co phan thap phan neu can
                kq=$(echo "scale=2; $a / $b" | bc)
                echo "Ket qua: $a / $b = $kq"
            fi
            ;;
    esac
done


#!/bin/bash

# Kiem tra xem co dung 2 tham so dau vao khong ($# la so luong tham so)
if [ $# -ne 2 ]; then
    echo "Loi: Ban phai truyen vao dung 2 tham so!"
    echo "Cu phap: $0 <chuoi_str> <so_nguyen_N>"
    exit 1
fi

str=$1
n=$2

# Vong lap for in chuoi N lan
for (( i=1; i<=n; i++ )); do
    echo "$str"
done
