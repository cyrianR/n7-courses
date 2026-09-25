#include <stdio.h>
#include <stdlib.h>

#define BUFSIZE 1024

int main(int argc, char *argv[]) {

    FILE *source, *destination;
    char buffer[BUFSIZE];

    source = fopen(argv[1], "r");
    if (source == NULL) {
        perror("Error opening source file");
        exit(EXIT_FAILURE);
    }

    destination = fopen(argv[2], "w");
    if (destination == NULL) {
        perror("Error opening destination file");
        fclose(source);
        exit(EXIT_FAILURE);
    }

    size_t bytes;
    while ((bytes = fread(buffer, 1, BUFSIZE, source)) > 0) {
        fwrite(buffer, 1, bytes, destination);
    }

    fclose(source);
    fclose(destination);

    return 0;

}
