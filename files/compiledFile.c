#include <stdio.h>
 
int main()
{
	char array[2048] = {0};
	char *ptr=array;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	--ptr;
	while (*ptr) {
		++ptr;
		putchar(*ptr);
		++*ptr;
		--ptr;
		--*ptr;
	}
	return 0;
}
