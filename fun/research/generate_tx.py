from random import randint
loop=1000
iter=1
while iter<loop:
  credit_acc=randint(1,99)
  amt=randint(1,50)
  print str(iter) + "," + str(credit_acc) + "," + str(credit_acc+1) + "," + str(amt) + ",NULL,NULL"
  iter += 1
