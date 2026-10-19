#!/bin/bash

echo "------- MENU -------"
echo "1. Cafe den"
echo "2. Cafe da"
echo "3. Cafe sua"
echo "4. Cafe cao"
echo "--------------------"

read -p "Ban chon thuc uong nao (1-4) ? " chon

case $chon in
    1)
        echo "Ban da chon: Cafe den"
        ;;
    2)
        echo "Ban da chon: Cafe da"
        ;;
    3)
        echo "Ban da chon: Cafe sua"
        ;;
    4)
        echo "Ban da chon: Cafe cao"
        ;;
    *)
        echo "Lua chon khong hop le!"
        ;;
esac
