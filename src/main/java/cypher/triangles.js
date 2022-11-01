
function triangleFit(a, b) {
    
    if (a[0] + a[1] <= a[2] || a[0] + a[2] <= a[1] || a[1] + a[2] <= a[0] || b[0] + b[1] <= b[2] || b[0] + b[2] <= b[1] || b[1] + b[2] <= b[0] ) {
        return false;
    } else if (a[0] + a[1] + a[2] <= b[0] + b[1] + b[2]) {
        return true;
    } else {
        return false;
    }
}

console.log(triangleFit([1, 1, 1], [1, 1, 1]));
console.log(triangleFit([1, 1, 1], [2, 2, 2]));
console.log(triangleFit([1, 2, 3], [1, 2, 2]));
console.log(triangleFit([1, 2, 4], [1, 2, 6]));