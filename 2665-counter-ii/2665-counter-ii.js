/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    old = init
    curr=init
    return{
        increment: ()=> {
           return curr+=1
        },
        decrement:()=> {
            return curr-=1
        },
        reset:()=> {
            curr=old
            return old
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */