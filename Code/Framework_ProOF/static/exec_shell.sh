./shell.sh $(($1)) $(($1 + $2 - 1)) &
./shell.sh $(($1 + $2)) $(($1 + $2 + $2 - 1)) &
./shell.sh $(($1 + $2 + $2)) $(($1 + $2 + $2 + $2 - 1)) &
./shell.sh $(($1 + $2 + $2 + $2)) $(($1 + $2 + $2 + $2 + $2 - 1)) &

