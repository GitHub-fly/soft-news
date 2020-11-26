git add .
echo "请输入提交描述信息"
read commit
echo "提交说明:" $commit
git commit -m $commit
git push

