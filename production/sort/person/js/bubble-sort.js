/**
 * created by 2019-09-16
 * 冒泡排序
 */

function selectSort(list, n) {
    var flag = true;
    for(var i = 0; i < n; i++) {
        flag = true;
        for(var j = n - 1; j > i; j--) {
            if(list[j] < list[j - 1]) {
                var tmp = list[j];
                list[j] = list[j - 1];
                list[j - 1] = tmp;
                flag = false;
            }
        }
        if(flag) {
            break;
        }
    }
}

function main() {
    var list = [10, 200, 1, 2, 3, 1, 4];
    selectSort(list, list.length);
    console.log(list);
}

main();