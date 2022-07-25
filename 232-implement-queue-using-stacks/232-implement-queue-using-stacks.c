typedef struct
{
    int top, bottom, size, *arr;

} MyQueue;

MyQueue *myQueueCreate()
{
    MyQueue *q = (MyQueue *)malloc(sizeof(MyQueue));
    q->top = -1;
    q->bottom = 0;
    q->size = 50;
    q->arr = (int *)malloc(q->size * sizeof(int *));
    return q;
}

void myQueuePush(MyQueue *obj, int x)
{
    if (obj->top != obj->size - 1)
    {
        obj->top++;
        obj->arr[obj->top] = x;
    }
}

bool myQueueEmpty(MyQueue *obj)
{
    if (obj->top <= -1 || (obj->bottom > obj->top))
    {
        return 1;
    }
    return 0;
}

int myQueuePop(MyQueue *obj)
{
    int temp;
    if (!myQueueEmpty(obj))
    {
        temp = obj->arr[obj->bottom];
        obj->bottom++;

        return temp;
    }
    exit(1);
}

int myQueuePeek(MyQueue *obj)
{
    return (obj->arr[obj->bottom]);
}

void myQueueFree(MyQueue *obj)
{

    free(obj); // free the allocated memory to the queue
}
