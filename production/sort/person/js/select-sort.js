/**
 * created by 2019-09-15
 * 选择排序
 */
function selectSort(list, n) {
    var pos;
    for(var i = 0; i < n; i++) {
        pos = i;
        for(var j = i + 1; j < n; j++) {
            if(list[pos] > list[j]) {
                pos = j;
            }
        }
        if(pos !== i) {
            var tmp = list[pos];
            list[pos] = list[i];
            list[i] = tmp;
        }
    }
}

function main() {
    var list = [10, 200, 1, 2, 3, 1, 4];
    selectSort(list, list.length);
    console.log(list);
}

main();