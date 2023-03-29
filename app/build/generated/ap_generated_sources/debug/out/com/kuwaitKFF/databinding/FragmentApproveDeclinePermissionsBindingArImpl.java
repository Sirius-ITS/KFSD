package com.kuwaitKFF.databinding;
import com.kuwaitKFF.R;
import com.kuwaitKFF.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentApproveDeclinePermissionsBindingArImpl extends FragmentApproveDeclinePermissionsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.vsHeader, 1);
        sViewsWithIds.put(R.id.topLinear, 2);
        sViewsWithIds.put(R.id.titleText, 3);
        sViewsWithIds.put(R.id.parentPanel, 4);
        sViewsWithIds.put(R.id.textView1, 5);
        sViewsWithIds.put(R.id.spinnerParentLayout, 6);
        sViewsWithIds.put(R.id.searchLevelSpinner, 7);
        sViewsWithIds.put(R.id.permissionsList, 8);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentApproveDeclinePermissionsBindingArImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 9, sIncludes, sViewsWithIds));
    }
    private FragmentApproveDeclinePermissionsBindingArImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.ListView) bindings[8]
            , (android.widget.Spinner) bindings[7]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.LinearLayout) bindings[2]
            , new androidx.databinding.ViewStubProxy((android.view.ViewStub) bindings[1])
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.vsHeader.setContainingBinding(this);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
        if (vsHeader.getBinding() != null) {
            executeBindingsOn(vsHeader.getBinding());
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}