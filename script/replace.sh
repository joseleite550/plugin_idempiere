#!/bin/bash

# define variaveis de origem/destino
SOURCE="$1"
DEST="$2"

# copia arquivos
IFS=$'\n'
for files in $(find $SOURCE);
do
  filename=$(sed "s/$SOURCE/$DEST/g" <<<"$files")
  if [ -d $files ]; 
  then
    mkdir -p $filename;
  fi
  if [ -f $files ]; 
  then
    rsync -a $files $filename;
  fi
done
# substitui string dentro de arquivos
echo "cd $DEST"
echo "grep -rl $SOURCE . | xargs sed -i 's/$SOURCE/$DEST/g'"
