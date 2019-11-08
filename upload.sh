gituser=$(git config --get user.name);
gitemail=$(git config --get user.email);
read -p "Descripcion del commit: " commit

if [ -z "$gituser" ]
then
    read -p "Introduce el nombre de tu perfil de GitHub: " gituser;
    git config --set user.name $gituser
fi

if [ -z "$gitemail" ]
then
    read -p "Introduce el email de tu perfil de GitHub: " gituser;
    git config --set user.email $gitemail
fi

git add .
git commit -m "$commit"
git push


