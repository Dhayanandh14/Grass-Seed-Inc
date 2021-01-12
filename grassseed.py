C=float(input())
if(0<C<=100):
  L = int(input())
  if( 0<L<=100):
    area = 0
    for i in range(1,L+1):
      lst = list(input().split())
      w=float(lst[0])
      l=float(lst[1])
      area = area + w * l
    print("{:.7f}".format(area*C))