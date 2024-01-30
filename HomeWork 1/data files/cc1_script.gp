set xlabel "Address (Decimal)"
set ylabel "Number of Occurrences"
set title "Address Occurrences Plot"
set grid

plot "cc1-writedata-decimal.txt" using 3:1 with linespoints title "Occurrences"

