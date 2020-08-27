#include <stdio.h>
/* print Fahrenheit-Celsius table
for fahr = 0, 20, ..., 300 */
main()
{
  int fahr, celsius;
  int lower, upper, step;
  lower = 0;
  upper = 300;
  step = 20;
  /* lower limit of temperature scale */
  /* upper limit */
  /* step size */
  celsius = lower;
  printf("%s\n", "Temperature Table ");
  while (celsius <= upper) {
    fahr = ((celsius * 9)/5) + 32;
      printf("%d\t%d\n", celsius, fahr);
    celsius = celsius + step;
  }
}
