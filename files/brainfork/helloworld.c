#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <sys/types.h>
 
int main()
{
	char array[2048] = {0};
	char *ptr=array;
	pid_t pid1 = fork();
	while (*ptr) {
		--*ptr;
		--ptr;
	}
	++*ptr;
	++*ptr;
	++*ptr;
	while (*ptr) {
		++ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		--ptr;
		--*ptr;
	}
	++ptr;
	while (*ptr) {
		++ptr;
		++*ptr;
		++ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		++ptr;
		++*ptr;
		++ptr;
		++*ptr;
		++*ptr;
		++ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		++ptr;
		++*ptr;
		++*ptr;
		--ptr;
		while (*ptr) {
			++*ptr;
			++*ptr;
			--ptr;
		}
		++ptr;
		--*ptr;
		--*ptr;
		--*ptr;
	}
	++ptr;
	--*ptr;
	++ptr;
	--*ptr;
	putchar(*ptr);
	while (*ptr) {
		++ptr;
		++*ptr;
		++*ptr;
		++ptr;
		++*ptr;
		--ptr;
		--ptr;
		--*ptr;
		--*ptr;
	}
	++ptr;
	--*ptr;
	--*ptr;
	putchar(*ptr);
	--*ptr;
	--*ptr;
	putchar(*ptr);
	++*ptr;
	putchar(*ptr);
	++ptr;
	++ptr;
	++ptr;
	++*ptr;
	++*ptr;
	putchar(*ptr);
	--ptr;
	--ptr;
	putchar(*ptr);
	--ptr;
	--*ptr;
	--*ptr;
	--*ptr;
	--*ptr;
	--*ptr;
	--*ptr;
	putchar(*ptr);
	++*ptr;
	putchar(*ptr);
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	putchar(*ptr);
	++ptr;
	++ptr;
	--*ptr;
	putchar(*ptr);
	--ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	putchar(*ptr);
	--ptr;
	--*ptr;
	--*ptr;
	putchar(*ptr);
	++ptr;
	++ptr;
	++ptr;
	putchar(*ptr);
	--ptr;
	--ptr;
	--*ptr;
	--*ptr;
	--*ptr;
	putchar(*ptr);
	--ptr;
	putchar(*ptr);
	--*ptr;
	--*ptr;
	++ptr;
	--*ptr;
	putchar(*ptr);
	++ptr;
	++*ptr;
	putchar(*ptr);
	while (*ptr) {
		++*ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		++*ptr;
		putchar(*ptr);
		--*ptr;
		--*ptr;
		--*ptr;
		--ptr;
	}
	++ptr;
	++ptr;
	while (*ptr) {
		putchar(*ptr);
		--*ptr;
		--*ptr;
		--*ptr;
		++ptr;
	}
	--ptr;
	--ptr;
	putchar(*ptr);
	--ptr;
	++*ptr;
	putchar(*ptr);
	++*ptr;
	++*ptr;
	putchar(*ptr);
	++*ptr;
	++*ptr;
	++ptr;
	++*ptr;
	++*ptr;
	++*ptr;
	while (*ptr) {
		putchar(*ptr);
		--ptr;
	}
	while (*ptr) {
		putchar(*ptr);
	}
	--ptr;
	++*ptr;
	++*ptr;
	putchar(*ptr);
	return 0;
}
