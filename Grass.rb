total=0
C=gets.to_f;
L=gets.to_i;
if 0<C && C<=100 and 0<L && L<=100
    for i in 1..L
      w,l=gets.chomp.split.map(&:to_f)
      t=w*l
      total=t+total;
    end
end
     total = total*C;
     print total;