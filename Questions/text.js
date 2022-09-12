function findSum(numArr, k){
    let max = 0;
    let sum = 0;
    for(let i = 0; i < numArr.length; i++) {
        if(i < k) {
            sum += numArr[i];
        } else {
            sum -= numArr[i-k];
            sum += numArr[i];
        }
        if(sum > max) {
            max = sum;
        }
        console.log(sum, max);
    }
    console.log(max);
}
// x = 10;
// foo();

// function foo() {
//     console.log(x);
// }
// class User {
//     constructor(firstName, lastName, year, major) {
//         this.firstName = firstName;
//         this.lastName = lastName;
//         this.year = year;
//         this.major = major;
//     }
// }


// var user = new User("Kewal", "Kanojia", 20, "IT");
// console.log(user.firstName);

// var user = new User("Karan", "Kumar", 18, "Arts");
// console.log(user.firstName);
// console.log(User.getPhone());


/*
let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12];

console.log(rotate(arr,3));

function rotate(arr, d) {
    let n = arr.length;
    // To handle if d >= n 
    d = d % n;
    let i, j, k, temp;
    let g_c_d = gcd(d, n);
    for (i = 0; i < g_c_d; i++) {
        //move i-th values of blocks 
        temp = arr[i];
        j = i;
        while (true) {
            k = j + d;
            if (k >= n) {
                k = k - n;
            }
            if (k == i) {
                break;
            }
            arr[j] = arr[k];
            j = k;
        }
        arr[j] = temp;
    }
    return arr;
}

function gcd(a, b) {
    if (b == 0) {
        return a;
    } else {
        return gcd(b, a % b);
    }
}




var num =3;
console.log(factorial(3));

function factorial(x) {
    if (x == 0) {
        return 1;
    } else {
        return x * factorial(x - 1);
    }
}

function f(x) {
    return x*x;
}
console.log(typeof f());
// var a =10;
// var b = a;

// a = 15;
// console.log(b,a);

// var string = "xyz123";
// var n = 1;
// let newString = "";
// for(var x=0;x<string.length;x++) {
//     if(string[x] > 0 || string[x] < 9) {
//         newString = newString + string[x];
//     } else {
//         console.log(string[x]);
//         const result = string.charCodeAt(x);
//         let char;
//         if(result < 122) {
//             char = String.fromCharCode(result+n);
//         } else {
//             char = String.fromCharCode(96+n);
//         }
//         newString = newString + char;
//     }
// }
// console.log(newString);



// function factorial(n) {
// 	// Write your code here
// 	var sum = 1;
// 	for(var x=n; x>=1;x--) {
// 	    sum *= x;
// 	}
// 	return sum;
// }


// var email = "kanojia@gmail.com"
// isValidEmail(email);
// function isValidEmail(email) {
// 	// Write your code here
//     if(email.indexOf("@")) {
//         var emailArray = email.split("@");
//         console.log(emailArray);
//     } else {
//         return false;
//     }
	
// }

// var name = "kewalok";

// // checkVowels(name);
// function checkVowels(name) {
//     var vowel = ['a', 'e', 'i' ,'o', 'u'];
//     var vCount = 0;
//     var cCount = 0;
//     for(x=name.length-1;x>=0;x--) {
//         if(vowel.includes(name.charAt(x))) {
//             vCount++;
//         } else {
//             cCount++;
//         }
//     }
//     console.log("Vowel: " + vCount + " Constent " +cCount);
// }



checkPalendrome("height");

function checkPalendrome(s) {
    let revString = "";
    for(x=s.length-1;x>=0;x--) {
        revString = revString + s.charAt(x);
    }
    if(revString == s) {
        return true;
    } else {
        return false;
    }
}
*/