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
